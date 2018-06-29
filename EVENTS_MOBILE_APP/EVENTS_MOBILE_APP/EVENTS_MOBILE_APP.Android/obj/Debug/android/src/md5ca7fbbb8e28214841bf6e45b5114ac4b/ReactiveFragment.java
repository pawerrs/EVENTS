package md5ca7fbbb8e28214841bf6e45b5114ac4b;


public class ReactiveFragment
	extends android.support.v4.app.Fragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"";
		mono.android.Runtime.register ("ReactiveUI.AndroidSupport.ReactiveFragment, ReactiveUI.AndroidSupport, Version=7.4.0.0, Culture=neutral, PublicKeyToken=null", ReactiveFragment.class, __md_methods);
	}


	public ReactiveFragment ()
	{
		super ();
		if (getClass () == ReactiveFragment.class)
			mono.android.TypeManager.Activate ("ReactiveUI.AndroidSupport.ReactiveFragment, ReactiveUI.AndroidSupport, Version=7.4.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
