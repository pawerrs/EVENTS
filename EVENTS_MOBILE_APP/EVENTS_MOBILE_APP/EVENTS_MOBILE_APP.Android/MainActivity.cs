using System;
using Android.App;
using Android.Content.PM;
using Android.OS;
using ReactiveUI.AndroidSupport;
using Android.Widget;
using System.Collections.Generic;
using EVENTS_MOBILE_APP.ViewModels;
using EVENTS_MOBILE_APP.Droid.Views;


namespace EVENTS_MOBILE_APP.Droid
{
    [Activity(Label = "EVENTS_MOBILE_APP",
        Icon = "@drawable/icon", 
        Theme = "@style/MainTheme",
        MainLauncher = true,
        ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    public class MainActivity:ReactiveAppCompatActivity
    {
        protected override void OnCreate(Bundle bundle)
        {
           
            base.OnCreate(bundle);

            SetContentView(Resource.Layout.Frame);

            var firstFragment = new FirstFragment() { ViewModel = new FirstViewModel() };
            this.NextFragment(Resource.Id.frame, firstFragment);

        }

        public override void OnBackPressed()
        {
            if (SupportFragmentManager.BackStackEntryCount == 1)
            {
                Finish();
            }
            else
            {
                if (SupportFragmentManager.BackStackEntryCount > 1)
                {
                    SupportFragmentManager.PopBackStackImmediate();
                }
            }
        }
    }
}

