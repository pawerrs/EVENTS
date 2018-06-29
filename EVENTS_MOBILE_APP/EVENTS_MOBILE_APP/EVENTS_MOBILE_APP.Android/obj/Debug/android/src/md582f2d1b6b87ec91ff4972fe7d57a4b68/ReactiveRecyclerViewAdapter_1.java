package md582f2d1b6b87ec91ff4972fe7d57a4b68;


public abstract class ReactiveRecyclerViewAdapter_1
	extends android.support.v7.widget.RecyclerView.Adapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBindViewHolder:(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroid_support_v7_widget_RecyclerView_ViewHolder_IHandler\n" +
			"n_getItemCount:()I:GetGetItemCountHandler\n" +
			"";
		mono.android.Runtime.register ("ReactiveUI.Android.Support.ReactiveRecyclerViewAdapter`1, ReactiveUI.AndroidSupport, Version=7.4.0.0, Culture=neutral, PublicKeyToken=null", ReactiveRecyclerViewAdapter_1.class, __md_methods);
	}


	public ReactiveRecyclerViewAdapter_1 ()
	{
		super ();
		if (getClass () == ReactiveRecyclerViewAdapter_1.class)
			mono.android.TypeManager.Activate ("ReactiveUI.Android.Support.ReactiveRecyclerViewAdapter`1, ReactiveUI.AndroidSupport, Version=7.4.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onBindViewHolder (p0, p1);
	}

	private native void n_onBindViewHolder (android.support.v7.widget.RecyclerView.ViewHolder p0, int p1);


	public int getItemCount ()
	{
		return n_getItemCount ();
	}

	private native int n_getItemCount ();

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
