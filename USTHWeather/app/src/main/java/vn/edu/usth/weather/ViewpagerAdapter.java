package vn.edu.usth.weather;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class ViewPagerAdapter extends FragmentStatePagerAdapter {
   public ViewPagerAdapter(@NonNull FragmentManager fm,int behavior){
       super(fm, behavior);
   }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
               return new ForecastFragment();

            case 1:
               return new WeatherFragment();
            default:
                return new ForecastFragment();
        }
    }
    @Override
    public int getCount() {
        return 2;
    }

   @Nullable
   @Override
   public CharSequence getPageTitle(int position) {
       String title = "";
       switch (position) {
           case 0:
               title = "Weather";
               break;

           case 1:
               title = "Forecast";
               break;
       }
       return title;
   }
}

