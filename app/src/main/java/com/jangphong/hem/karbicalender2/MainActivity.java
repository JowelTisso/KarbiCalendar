package com.jangphong.hem.karbicalender2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.PorterDuff;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.jangphong.hem.karbicalender2.helperclass.HttpHandler;
import com.jangphong.hem.karbicalender2.monthfragments.JanuaryFrag;
import com.jangphong.hem.karbicalender2.monthfragments.NovemberFrag;
import com.jangphong.hem.karbicalender2.monthfragments.OctoberFrag;
import com.jangphong.hem.karbicalender2.monthfragments.DecemberFrag;
import com.jangphong.hem.karbicalender2.monthfragments.FebruaryFrag;
import com.jangphong.hem.karbicalender2.monthfragments.JuneFrag;
import com.jangphong.hem.karbicalender2.monthfragments.MarchFrag;
import com.jangphong.hem.karbicalender2.monthfragments.AprilFrag;
import com.jangphong.hem.karbicalender2.monthfragments.MayFrag;
import com.jangphong.hem.karbicalender2.monthfragments.JulyFrag;
import com.jangphong.hem.karbicalender2.monthfragments.AugustFrag;
import com.jangphong.hem.karbicalender2.monthfragments.SeptemberFrag;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager viewPager;
    EditText txt;
    String VersionUpdate;
    ProgressDialog progressDialog;
    ImageView imgSpinner;
   // int viewPagerCount;
    public static Activity mainActivity;

    @SuppressLint("StaticFieldLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        toolbar.getOverflowIcon().setColorFilter(getResources().getColor(R.color.colorPrimaryDark), PorterDuff.Mode.SRC_ATOP);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorPrimaryDark));

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        viewPager = findViewById(R.id.view_pager);

        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

        Calendar cal = Calendar.getInstance();
        if (cal.get(Calendar.MONTH) == Calendar.JANUARY) {
            viewPager.setCurrentItem(0);
        } else if (cal.get(Calendar.MONTH) == Calendar.FEBRUARY) {
            viewPager.setCurrentItem(1);
        } else if (cal.get(Calendar.MONTH) == Calendar.MARCH) {
            viewPager.setCurrentItem(2);
        } else if (cal.get(Calendar.MONTH) == Calendar.APRIL) {
            viewPager.setCurrentItem(3);
        } else if (cal.get(Calendar.MONTH) == Calendar.MAY) {
            viewPager.setCurrentItem(4);
        } else if (cal.get(Calendar.MONTH) == Calendar.JUNE) {
            viewPager.setCurrentItem(5);
        } else if (cal.get(Calendar.MONTH) == Calendar.JULY) {
            viewPager.setCurrentItem(6);
        } else if (cal.get(Calendar.MONTH) == Calendar.AUGUST) {
            viewPager.setCurrentItem(7);
        } else if (cal.get(Calendar.MONTH) == Calendar.SEPTEMBER) {
            viewPager.setCurrentItem(8);
        } else if (cal.get(Calendar.MONTH) == Calendar.OCTOBER) {
            viewPager.setCurrentItem(9);
        } else if (cal.get(Calendar.MONTH) == Calendar.NOVEMBER) {
            viewPager.setCurrentItem(10);
        } else if (cal.get(Calendar.MONTH) == Calendar.DECEMBER) {
            viewPager.setCurrentItem(11);
        }

      /*  if (isNetworkConnected() == true) {
            new VersionCheck() {

                @Override
                protected void onPostExecute(Void result) {

                    String VersionName = BuildConfig.VERSION_NAME;

                    if (VersionName.equals(VersionUpdate)) {

                    } else {
                        Toast.makeText(MainActivity.this, "New Update Available", Toast.LENGTH_LONG).show();
                    }
                }
            }.execute();
        }*/

        imgSpinner = findViewById(R.id.spinnerImage);

        final PopupMenu dropDownMenu = new PopupMenu(this, imgSpinner);

        final Menu menu = dropDownMenu.getMenu();

// OR inflate your menu from an XML:
        dropDownMenu.getMenuInflater().inflate(R.menu.spinner_menu, menu);

        dropDownMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.jan:
                        // item ID 0 was clicked
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.feb:
                        // item ID 1 was clicked
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.march:
                        // item ID 2 was clicked
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.april:
                        // item ID 3 was clicked
                        viewPager.setCurrentItem(3);
                        break;
                    case R.id.may:
                        // item ID 4 was clicked
                        viewPager.setCurrentItem(4);
                        break;
                    case R.id.june:
                        // item ID 5 was clicked
                        viewPager.setCurrentItem(5);
                        break;
                    case R.id.july:
                        // item ID 6 was clicked
                        viewPager.setCurrentItem(6);
                        break;
                    case R.id.aug:
                        // item ID 7 was clicked
                        viewPager.setCurrentItem(7);
                        break;
                    case R.id.sep:
                        // item ID 8 was clicked
                        viewPager.setCurrentItem(8);
                        break;
                    case R.id.oct:
                        // item ID 9 was clicked
                        viewPager.setCurrentItem(9);
                        break;
                    case R.id.nov:
                        // item ID 10 was clicked
                        viewPager.setCurrentItem(10);
                        break;
                    case R.id.dec:
                        // item ID 11 was clicked
                        viewPager.setCurrentItem(11);
                        break;
                        
                }
                return true;
            }
        });

        imgSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dropDownMenu.show();
            }
        });

        Intent i = getIntent();
        if (i!=null)
        {
            String check = i.getStringExtra("key1");
            int monCount = i.getIntExtra("monthCount",0);
            if (check !=null)
            {
                if (check.length() != 0 )
                {
                    viewPager.setCurrentItem(monCount);
                }
            }else {}

        }else
            Toast.makeText(this,"null",Toast.LENGTH_SHORT).show();

        mainActivity = this;

    }

   /* public void setViewPagerItem(int a)
    {
        viewPagerCount = a;
    }*/

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }


    public class MyPagerAdapter extends FragmentStatePagerAdapter {


        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {

            switch (pos) {

                case 0:
                    return JanuaryFrag.newInstance("JanuaryFrag, Instance 1");
                case 1:
                    return FebruaryFrag.newInstance("FebruaryFrag, Instance 2");
                case 2:
                    return MarchFrag.newInstance("MarchFrag, Instance 3");
                case 3:
                    return AprilFrag.newInstance("AprilFrag, Instance 4");
                case 4:
                    return MayFrag.newInstance("MayFrag, Instance 5");
                case 5:
                    return JuneFrag.newInstance("JuneFrag, Instance 6");
                case 6:
                    return JulyFrag.newInstance("JulyFrag, Instance 7");
                case 7:
                    return AugustFrag.newInstance("AugustFrag, Instance 8");
                case 8:
                    return SeptemberFrag.newInstance("SeptemberFrag, Instance 9");
                case 9:
                    return OctoberFrag.newInstance("OctoberFrag, Instance 10");
                case 10:
                    return NovemberFrag.newInstance("NovemberFrag, Instance 11");
                case 11:
                    return DecemberFrag.newInstance("DecemberFrag, Instance 12");
                default:
                    return JanuaryFrag.newInstance("JanuaryFrag, Default");
            }
        }

        @Override
        public int getCount() {
            return 12;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }else if(viewPager.getHeight() == 800){
            viewPager.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        } else {
            finish();
            System.exit(0);
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_exit) {
            finish();
            System.exit(0);
        } else if (id == R.id.action_reminder) {
            Intent rem = new Intent(MainActivity.this, ReminderList.class);
            startActivity(rem);
        } else if (id == R.id.action_notes) {
            Intent i = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        ApplicationInfo app = getApplicationContext().getApplicationInfo();
        String filePath = app.sourceDir;
        //String filepath = "/data/app/com.jangphong.hem.karbicalender2-2";
        int id = item.getItemId();

        if (id == R.id.home) {
            // Handle the home action
            Intent a = new Intent(MainActivity.this, MainActivity.class);
            finish();
            startActivity(a);
        } else if (id == R.id.about) {
            Intent b = new Intent(MainActivity.this, About.class);
            startActivity(b);
        } else if (id == R.id.holiday) {
            Intent h = new Intent(MainActivity.this, holidays.class);
            startActivity(h);
        }

        else if (id == R.id.cal_update) {

            if (isNetworkConnected() == true) {
                new VersionCheck().execute();

                progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setMessage("Checking for Update");
                progressDialog.show();
            }

        } else if (id == R.id.nav_share) {

           // File file = new File(filePath);
            //Uri appUri = FileProvider.getUriForFile(this,getPackageName()+".provider",file);
            Intent c = new Intent(Intent.ACTION_SEND);
            c.setType("text/plain");
            String shareBody = "https://play.google.com/store/apps/details?id=com.jangphong.hem.karbicalender2";
            String shareSub = "Download Karbi calendar 2019";
            c.putExtra(Intent.EXTRA_SUBJECT, shareSub);
            c.putExtra(Intent.EXTRA_TEXT, shareBody);
            //c.putExtra(Intent.EXTRA_STREAM, appUri);
            //c.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

            startActivity(Intent.createChooser(c, "Share using"));

            //Toast.makeText(this, getPackageName(), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.policy) {
            Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.karbidigitalresources.tk/privacy-policy"));
            startActivity(in);
        } else if (id == R.id.instagram_id) {

            Uri uri = Uri.parse("https://www.instagram.com/karbidigitals");
            Intent insta = new Intent(Intent.ACTION_VIEW, uri);
            insta.setPackage("com.instagram.android");

            try {
                startActivity(insta);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                       Uri.parse("https://www.instagram.com/karbidigitals")));
            }
        } else if (id == R.id.rate_id) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public class VersionCheck extends AsyncTask<Void, Void, Void> {


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... arg0) {

            HttpHandler sh = new HttpHandler();

            String url = "http://karbidigitalresources.tk/json-file/version.json";
            String jsonStr = sh.makeServiceCall(url);

            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);
                    JSONArray version = jsonObj.getJSONArray("Version");
                    for (int i = 0; i < version.length(); i++) {

                        JSONObject v = version.getJSONObject(i);

                        VersionUpdate = v.getString("version");

                    }
                } catch (final JSONException e) {
                    // Log.e(TAG, "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG)
                                    .show();
                        }
                    });

                }
            } else {
                //Log.e(TAG, "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG)
                                .show();
                    }
                });

            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);

            progressDialog.dismiss();


            String VersionName = BuildConfig.VERSION_NAME;


            if (VersionName.equals(VersionUpdate)) {

                Toast.makeText(MainActivity.this, "No Update Available", Toast.LENGTH_SHORT).show();

            } else {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("New Update Available");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(true);
                builder.setMessage("New improved features available, update to avail")
                        .setPositiveButton("UPDATE", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                final String appName = getPackageName();

                                try {
                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appName)));
                                } catch (android.content.ActivityNotFoundException anfe) {
                                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + appName)));
                                }

                                finish();

                            }
                        })
                        .setNegativeButton("CANCEL", null)
                ;

                AlertDialog alert = builder.create();
                alert.show();

            }
        }
    }

}



