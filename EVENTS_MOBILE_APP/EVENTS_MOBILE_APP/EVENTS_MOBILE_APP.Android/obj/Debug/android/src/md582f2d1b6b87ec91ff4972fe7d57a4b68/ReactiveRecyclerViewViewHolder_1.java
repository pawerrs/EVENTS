package md582f2d1b6b87ec91ff4972fe7d57a4b68;


public class ReactiveRecyclerViewViewHolder_1
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("ReactiveUI.Android.Support.ReactiveRecyclerViewViewHolder`1, ReactiveUI.AndroidSupport, Version=7.4.0.0, Culture=neutral, PublicKeyToken=null", ReactiveRecyclerViewViewHolder_1.class, __md_methods);
	}


	public ReactiveRecyclerViewViewHolder_1 (android.view.View p0)
	{
		super (p0);
		if (getClass () == ReactiveRecyclerViewViewHolder_1.class)
			mono.android.TypeManager.Activate ("ReactiveUI.Android.Support.ReactiveRecyclerViewViewHolder`1, ReactiveUI.AndroidSupport, Version=7.4.0.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

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
