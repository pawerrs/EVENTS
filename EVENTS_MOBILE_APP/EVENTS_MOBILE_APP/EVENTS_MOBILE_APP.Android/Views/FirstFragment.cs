using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using EVENTS_MOBILE_APP.ViewModels;

namespace EVENTS_MOBILE_APP.Droid.Views
{
    public class FirstFragment: ReactiveUI.AndroidSupport.ReactiveFragment<FirstViewModel>
    {
        Button _signInButton;
        Button _signUpButton;
        public FirstFragment()
        {

        }


        public override View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
        {
            base.OnCreateView(inflater, container, savedInstanceState);

            var view = inflater.Inflate(Resource.Layout.FirstFragment, container, false);
            _signInButton = view.FindViewById<Button>(Resource.Id.signInButton);
            _signUpButton = view.FindViewById<Button>(Resource.Id.signUpButton);

            return view;

        }
    }
}