package md5ca7fbbb8e28214841bf6e45b5114ac4b;


public class ReactiveAppCompatActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"n_onActivityResult:(IILandroid/content/Intent;)V:GetOnActivityResult_IILandroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("ReactiveUI.AndroidSupport.ReactiveAppCompatActivity, ReactiveUI.AndroidSupport, Version=7.4.0.0, Culture=neutral, PublicKeyToken=null", ReactiveAppCompatActivity.class, __md_methods);
	}


	public ReactiveAppCompatActivity ()
	{
		super ();
		if (getClass () == ReactiveAppCompatActivity.class)
			mono.android.TypeManager.Activate ("ReactiveUI.AndroidSupport.ReactiveAppCompatActivity, ReactiveUI.AndroidSupport, Version=7.4.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();


	public void onActivityResult (int p0, int p1, android.content.Intent p2)
	{
		n_onActivityResult (p0, p1, p2);
	}

	private native void n_onActivityResult (int p0, int p1, android.content.Intent p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
