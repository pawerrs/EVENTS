using ReactiveUI;
using System.Reactive;
using EVENTS_MOBILE_APP.ViewModels;

namespace EVENTS_MOBILE_APP.ViewModels
{
    public class FirstViewModel: ReactiveViewModel
    {
        public FirstViewModel()
        {

            SwitchToSignIn = ReactiveCommand.Create<Unit, SignInViewModel>(_ => new SignInViewModel());
            SwitchToSignUp = ReactiveCommand.Create<Unit, SignUpViewModel>(_ => new SignUpViewModel());

        }

        public ReactiveCommand<Unit, SignInViewModel> SwitchToSignIn { get; private set; }
        public ReactiveCommand<Unit, SignUpViewModel> SwitchToSignUp { get; private set; }
    }

}

  
