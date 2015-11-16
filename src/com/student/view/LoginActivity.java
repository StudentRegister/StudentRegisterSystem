package com.student.view;

import java.util.List;

import com.cedrus.student.R;
import com.student.beans.Student;

import cn.bmob.push.BmobPush;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobInstallation;
import cn.bmob.v3.BmobPushManager;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.datatype.BmobQueryResult;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SQLQueryListener;
import cn.bmob.v3.listener.SaveListener;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	private EditText msno, mpassword, mquery;
	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		// Bmob�ĳ�ʼ��
		Bmob.initialize(this, "8e88cb5d708aba36d8021384f9eb69cf");
		// Push SDK�ĳ�ʼ��
		BmobInstallation.getCurrentInstallation(this).save();
		BmobPush.startWork(this, "8e88cb5d708aba36d8021384f9eb69cf");

		msno = (EditText) findViewById(R.id.name);
		mpassword = (EditText) findViewById(R.id.password);
		btn = (Button) findViewById(R.id.btn);
	}


	public void submit(View v) {
		String sno = msno.getText().toString();
		final String password = mpassword.getText().toString();

		if (sno.equals("") || password.equals("")) {
			return;
		}
		
		String bql ="select password from Student where sNo =? ";//��ѯ���е���Ϸ�÷ּ�¼
		BmobQuery<Student> query = new BmobQuery<Student>();
		query.setSQL(bql);
		query.setPreparedParams(new Object[]{sno});
		query.doSQLQuery(LoginActivity.this, new SQLQueryListener<Student>() {

			@Override
			public void done(BmobQueryResult<Student> result, BmobException e) {
				if(e==null){
					List<Student> list = result.getResults();
					if(list!=null && list.size()>0){
						for(Student s:list){
							System.out.println(s.toString());
//							toast(s.toString());
							if(password.equals(s.getPassword())){
								toast("��½�ɹ�");
							}
							else{
								toast("�ʺŻ��������");
							}
						}
					}
					else{
						toast("�ʺŲ�����");
						Log.i("smile", "��ѯ�ɹ��������ݷ���");
					}
				}else{
					toast("�����룺"+e.getErrorCode()+"������������"+e.getMessage());
					System.out.println("�����룺"+e.getErrorCode()+"������������"+e.getMessage());
					Log.i("smile", "�����룺"+e.getErrorCode()+"������������"+e.getMessage());
				}
				
			}
		});

	}

	public void queryAll(View view) {
		BmobQuery<Student> query = new BmobQuery<Student>();

		query.findObjects(LoginActivity.this, new FindListener<Student>() {

			@Override
			public void onSuccess(List<Student> feedbacks) {
				AlertDialog.Builder builder = new AlertDialog.Builder(
						LoginActivity.this);
				builder.setTitle("Query");
				String str = "";

				for (Student feedback : feedbacks) {
					str += feedback.getsNo() + ":" + feedback.getPassword()
							+ "\n";
				}
				builder.setMessage(str);
				builder.create().show();
			}

			@Override
			public void onError(int arg0, String arg1) {

			}
		});
	}
	
	
	public void toast(String toast){
		Toast.makeText(LoginActivity.this, toast, Toast.LENGTH_LONG).show();
	}

}