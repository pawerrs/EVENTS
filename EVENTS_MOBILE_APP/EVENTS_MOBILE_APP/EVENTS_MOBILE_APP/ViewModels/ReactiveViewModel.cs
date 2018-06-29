using ReactiveUI;

namespace EVENTS_MOBILE_APP.ViewModels
{
    public abstract class ReactiveViewModel : ReactiveObject, ISupportsActivation
    {
        public ViewModelActivator Activator { get; }

        protected ReactiveViewModel() : this(new ViewModelActivator())
        {

        }

        protected ReactiveViewModel(ViewModelActivator viewModelActivator)
        {
            Activator = viewModelActivator;
        }
    }
}