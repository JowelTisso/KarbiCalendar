package com.jangphong.hem.karbicalender2.monthfragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import com.jangphong.hem.karbicalender2.HolidayPopupWindow;
import com.jangphong.hem.karbicalender2.R;
import com.jangphong.hem.karbicalender2.notesactivities.april;

import java.util.Calendar;

public class AprilFrag extends Fragment
{
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    TextView t11;
    TextView t12;
    TextView t13;
    TextView t14;
    TextView t15;
    TextView t16;
    TextView t17;
    TextView t18;
    TextView t19;
    TextView t20;
    TextView t21;
    TextView t22;
    TextView t23;
    TextView t24;
    TextView t25;
    TextView t26;
    TextView t27;
    TextView t28;
    TextView t29;
    TextView t30;
    String n1;
    String n2;
    String n3;
    String n4;
    String n5;
    String n6;
    String n7;
    String n8;
    String n9;
    String n10;
    String n11;
    String n12;
    String n13;
    String n14;
    String n15;
    String n16;
    String n17;
    String n18;
    String n19;
    String n20;
    String n21;
    String n22;
    String n23;
    String n24;
    String n25;
    String n26;
    String n27;
    String n28;
    String n29;
    String n30;
    String o1;
    String o2;
    String o3;
    String o4;
    String o5;
    String o6;
    String o7;
    String o8;
    String o9;
    String o10;
    String o11;
    String o12;
    String o13;
    String o14;
    String o15;
    String o16;
    String o17;
    String o18;
    String o19;
    String o20;
    String o21;
    String o22;
    String o23;
    String o24;
    String o25;
    String o26;
    String o27;
    String o28;
    String o29;
    String o30;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_april, container, false);

        //tofindviewby id, defining inflater is necessary in onCreateView
        t1 = v.findViewById(R.id.day1);
        t2 = v.findViewById(R.id.day2);
        t3 = v.findViewById(R.id.day3);
        t4 = v.findViewById(R.id.day4);
        t5 = v.findViewById(R.id.day5);
        t6 = v.findViewById(R.id.day6);
        t7 = v.findViewById(R.id.day7);
        t8 = v.findViewById(R.id.day8);
        t9 = v.findViewById(R.id.day9);
        t10 = v.findViewById(R.id.day10);
        t11 = v.findViewById(R.id.day11);
        t12 = v.findViewById(R.id.day12);
        t13 = v.findViewById(R.id.day13);
        t14 = v.findViewById(R.id.day14);
        t15 = v.findViewById(R.id.day15);
        t16 = v.findViewById(R.id.day16);
        t17 = v.findViewById(R.id.day17);
        t18 = v.findViewById(R.id.day18);
        t19 = v.findViewById(R.id.day19);
        t20 = v.findViewById(R.id.day20);
        t21 = v.findViewById(R.id.day21);
        t22 = v.findViewById(R.id.day22);
        t23 = v.findViewById(R.id.day23);
        t24 = v.findViewById(R.id.day24);
        t25 = v.findViewById(R.id.day25);
        t26 = v.findViewById(R.id.day26);
        t27 = v.findViewById(R.id.day27);
        t28 = v.findViewById(R.id.day28);
        t29 = v.findViewById(R.id.day29);
        t30 = v.findViewById(R.id.day30);


        april frag3 = new april();
        n1 = april.getDefaults("strapril",getContext());
        o1 = t1.getText().toString();
        if (n1!=null)
        {
            t1.setText(o1 +"\n"+" "+"\n"+n1);
        }


        n2 = april.getDefaults("strapril2",getContext());
        o2 = t2.getText().toString();
        if (n2!=null)
        {
            t2.setText(o2 +"\n"+" "+"\n"+n2);
        }


        n3 = april.getDefaults("strapril3",getContext());
        o3 = t3.getText().toString();
        if (n3!=null)
        {
            t3.setText(o3 +"\n"+" "+"\n"+ n3);
        }


        n4 = april.getDefaults("strapril4",getContext());
        o4 = t4.getText().toString();
        if (n4!=null)
        {
            t4.setText(o4 +"\n"+" "+"\n"+ n4);
        }


        n5 = april.getDefaults("strapril5",getContext());
        o5 = t5.getText().toString();
        if (n5!=null)
        {
            t5.setText(o5 +"\n"+" "+"\n"+ n5);
        }


        n6 = april.getDefaults("strapril6",getContext());
        o6 = t6.getText().toString();
        if (n6!=null)
        {
            t6.setText(o6 +"\n"+" "+"\n"+ n6);
        }


        n7 = april.getDefaults("strapril7",getContext());
        o7 = t7.getText().toString();
        if (n7!=null)
        {
            t7.setText(o7 +"\n"+" "+"\n"+ n7);
        }


        n8 = april.getDefaults("strapril8",getContext());
        o8 = t8.getText().toString();
        if (n8!=null)
        {
            t8.setText(o8 +"\n"+" "+"\n"+ n8);
        }



        n9 = april.getDefaults("strapril9",getContext());
        o9 = t9.getText().toString();
        if (n2!=null)
        {
            t9.setText(o9 +"\n"+" "+"\n"+ n9);
        }


        n10 = april.getDefaults("strapril10",getContext());
        o10 = t10.getText().toString();
        if (n10!=null)
        {
            t10.setText(o10 +"\n"+" "+"\n"+ n10);
        }


        n11 = april.getDefaults("strapril11",getContext());
        o11 = t11.getText().toString();
        if (n11!=null)
        {
            t11.setText(o11 +"\n"+" "+"\n"+ n11);
        }


        n12 = april.getDefaults("strapril12",getContext());
        o12 = t12.getText().toString();
        if (n12!=null)
        {
            t12.setText(o12 +"\n"+" "+"\n"+ n12);
        }


        n13 = april.getDefaults("strapril13",getContext());
        o13 = t13.getText().toString();
        if (n13!=null)
        {
            t13.setText(o13 +"\n"+" "+"\n"+ n13);
        }


        n14 = april.getDefaults("strapril14",getContext());
        o14 = t14.getText().toString();
        if (n14!=null)
        {
            t14.setText(o14 +"\n"+" "+"\n"+ n14);
        }


        n15 = april.getDefaults("strapril15",getContext());
        o15 = t15.getText().toString();
        if (n15!=null)
        {
            t15.setText(o15 +"\n"+" "+"\n"+ n15);
        }


        n16 = april.getDefaults("strapril16",getContext());
        o16 = t16.getText().toString();
        if (n2!=null)
        {
            t16.setText(o16 +"\n"+" "+"\n"+ n16);
        }


        n17 = april.getDefaults("strapril17",getContext());
        o17 = t17.getText().toString();
        if (n17!=null)
        {
            t17.setText(o17 +"\n"+" "+"\n"+ n17);
        }


        n18 = april.getDefaults("strapril18",getContext());
        o18 = t18.getText().toString();
        if (n18!=null)
        {
            t18.setText(o18 +"\n"+" "+"\n"+ n18);
        }


        n19 = april.getDefaults("strapril19",getContext());
        o19 = t19.getText().toString();
        if (n19!=null)
        {
            t19.setText(o19 +"\n"+" "+"\n"+ n19);
        }


        n20 = april.getDefaults("strapril20",getContext());
        o20 = t20.getText().toString();
        if (n20!=null)
        {
            t20.setText(o20 +"\n"+" "+"\n"+ n20);
        }


        n21 = april.getDefaults("strapril21",getContext());
        o21 = t21.getText().toString();
        if (n21!=null)
        {
            t21.setText(o21 +"\n"+" "+"\n"+ n21);
        }


        n22 = april.getDefaults("strapril22",getContext());
        o22 = t22.getText().toString();
        if (n22!=null)
        {
            t22.setText(o22 +"\n"+" "+"\n"+ n22);
        }


        n23 = april.getDefaults("strapril23",getContext());
        o23 = t23.getText().toString();
        if (n23!=null)
        {
            t23.setText(o23 +"\n"+" "+"\n"+ n23);
        }


        n24 = april.getDefaults("strapril24",getContext());
        o24 = t24.getText().toString();
        if (n24!=null)
        {
            t24.setText(o24 +"\n"+" "+"\n"+ n24);
        }


        n25 = april.getDefaults("strapril25",getContext());
        o25 = t25.getText().toString();
        if (n25!=null)
        {
            t25.setText(o25 +"\n"+" "+"\n"+ n25);
        }


        n26 = april.getDefaults("strapril26",getContext());
        o26 = t26.getText().toString();
        if (n26!=null)
        {
            t26.setText(o26 +"\n"+" "+"\n"+ n26);
        }


        n27 = april.getDefaults("strapril27",getContext());
        o27 = t27.getText().toString();
        if (n27!=null)
        {
            t27.setText(o27 +"\n"+" "+"\n"+ n27);
        }


        n28 = april.getDefaults("strapril28",getContext());
        o28 = t28.getText().toString();
        if (n28!=null)
        {
            t28.setText(o28 +"\n"+" "+"\n"+ n28);
        }


        n29 = april.getDefaults("strapril29",getContext());
        o29 = t29.getText().toString();
        if (n29!=null)
        {
            t29.setText(o29 +"\n"+" "+"\n"+ n29);
        }

        n30 = april.getDefaults("strapril30",getContext());
        o30 = t30.getText().toString();
        if (n30!=null)
        {
            t30.setText(o30 +"\n"+" "+"\n"+ n30);
        }





        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Calendar cal = Calendar.getInstance();
        if(cal.get(Calendar.MONTH)==Calendar.APRIL)
        {
            if (cal.get(Calendar.DATE) == 1) {
                TextView t1 = getView().findViewById(R.id.day1);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 2) {
                TextView t1 = getView().findViewById(R.id.day2);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 3) {
                TextView t1 = getView().findViewById(R.id.day3);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 4) {
                TextView t1 = getView().findViewById(R.id.day4);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 5) {
                TextView t1 = getView().findViewById(R.id.day5);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 6) {
                TextView t1 = getView().findViewById(R.id.day6);
                t1.setBackgroundResource(R.drawable.cell_shape_local);
            }
            else if (cal.get(Calendar.DATE) == 7) {
                TextView t1 = getView().findViewById(R.id.day7);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 8) {
                TextView t1 = getView().findViewById(R.id.day8);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 9) {
                TextView t1 = getView().findViewById(R.id.day9);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 10) {
                TextView t1 = getView().findViewById(R.id.day10);
                t1.setBackgroundResource(R.drawable.cell_shape_national);
            }
            else if (cal.get(Calendar.DATE) == 11) {
                TextView t1 = getView().findViewById(R.id.day11);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 12) {
                TextView t1 = getView().findViewById(R.id.day12);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 13) {
                TextView t1 = getView().findViewById(R.id.day13);
                t1.setBackgroundResource(R.drawable.cell_shape_national);
            }
            else if (cal.get(Calendar.DATE) == 14) {
                TextView t1 = getView().findViewById(R.id.day14);
                t1.setBackgroundResource(R.drawable.cell_shape_national);
            }
            else if (cal.get(Calendar.DATE) == 15) {
                TextView t1 = getView().findViewById(R.id.day15);
                t1.setBackgroundResource(R.drawable.cell_shape_national);
            }
            else if (cal.get(Calendar.DATE) == 16) {
                TextView t1 = getView().findViewById(R.id.day16);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 17) {
                TextView t1 = getView().findViewById(R.id.day17);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 18) {
                TextView t1 = getView().findViewById(R.id.day18);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 19) {
                TextView t1 = getView().findViewById(R.id.day19);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 20) {
                TextView t1 = getView().findViewById(R.id.day20);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 21) {
                TextView t1 = getView().findViewById(R.id.day21);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 22) {
                TextView t1 = getView().findViewById(R.id.day22);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 23) {
                TextView t1 = getView().findViewById(R.id.day23);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 24) {
                TextView t1 = getView().findViewById(R.id.day24);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 25) {
                TextView t1 = getView().findViewById(R.id.day25);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 26) {
                TextView t1 = getView().findViewById(R.id.day26);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 27) {
                TextView t1 = getView().findViewById(R.id.day27);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 28) {
                TextView t1 = getView().findViewById(R.id.day28);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 29) {
                TextView t1 = getView().findViewById(R.id.day29);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
            else if (cal.get(Calendar.DATE) == 30) {
                TextView t1 = getView().findViewById(R.id.day30);
                t1.setBackgroundResource(R.drawable.cell_shape);
            }
        }

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getContext(), HolidayPopupWindow.class);
                i.putExtra("holiday",o1);
                i.putExtra("note",n1);
                i.putExtra("dayName", "Theman, Thurs");
                i.putExtra("date","01 April 2020");
                i.putExtra("dateInt",1);
                i.putExtra("month", 4);

                startActivity(i);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o2);
                i.putExtra("note",n2);
                i.putExtra("dayName", "Bhomta, Fri");
                i.putExtra("date","02 April 2020");
                i.putExtra("dateInt",2);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o3);
                i.putExtra("note",n3);
                i.putExtra("dayName", "Bhomti, Sat");
                i.putExtra("date","03 April 2020");
                i.putExtra("dateInt",3);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o4);
                i.putExtra("note",n4);
                i.putExtra("dayName", "Bhomkuru, Sun");
                i.putExtra("date","04 April 2020");
                i.putExtra("dateInt",4);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o5);
                i.putExtra("note",n5);
                i.putExtra("dayName", "Urmi, Tue");
                i.putExtra("date","05 April 2020");
                i.putExtra("dateInt",5);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o6);
                i.putExtra("note",n6);
                i.putExtra("dayName", "Durmi, Tue");
                i.putExtra("date","06 April 2020");
                i.putExtra("dateInt",6);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o7);
                i.putExtra("note",n7);
                i.putExtra("dayName", "Thelang, Wed");
                i.putExtra("date","07 April 2020");
                i.putExtra("dateInt",7);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o8);
                i.putExtra("note",n8);
                i.putExtra("dayName", "Theman, Thurs");
                i.putExtra("date","08 April 2020");
                i.putExtra("dateInt",8);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o9);
                i.putExtra("note",n9);
                i.putExtra("dayName", "Bhomta, Fri");
                i.putExtra("date","09 April 2020");
                i.putExtra("dateInt",9);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o10);
                i.putExtra("note",n10);
                i.putExtra("dayName", "Bhomti, Sat");
                i.putExtra("date","10 April 2020");
                i.putExtra("dateInt",10);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o11);
                i.putExtra("note",n11);
                i.putExtra("dayName", "Bhomkuru, Sun");
                i.putExtra("date","11 April 2020");
                i.putExtra("dateInt",11);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o12);
                i.putExtra("note",n12);
                i.putExtra("dayName", "Urmi, Tue");
                i.putExtra("date","12 April 2020");
                i.putExtra("dateInt",12);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o13);
                i.putExtra("note",n13);
                i.putExtra("dayName", "Durmi, Tue");
                i.putExtra("date","13 April 2020");
                i.putExtra("dateInt",13);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o14);
                i.putExtra("note",n14);
                i.putExtra("dayName", "Thelang, Wed");
                i.putExtra("date","14 April 2020");
                i.putExtra("dateInt",14);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o15);
                i.putExtra("note",n15);
                i.putExtra("dayName", "Theman, Thurs");
                i.putExtra("date","15 April 2020");
                i.putExtra("dateInt",15);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o16);
                i.putExtra("note",n16);
                i.putExtra("dayName", "Bhomta, Fri");
                i.putExtra("date","16 April 2020");
                i.putExtra("dateInt",16);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o17);
                i.putExtra("note",n17);
                i.putExtra("dayName", "Bhomti, Sat");
                i.putExtra("date","17 April 2020");
                i.putExtra("dateInt",17);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o18);
                i.putExtra("note",n18);
                i.putExtra("dayName", "Bhomkuru, Sun");
                i.putExtra("date","18 April 2020");
                i.putExtra("dateInt",18);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o19);
                i.putExtra("note",n19);
                i.putExtra("dayName", "Urmi, Tue");
                i.putExtra("date","19 April 2020");
                i.putExtra("dateInt",19);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o20);
                i.putExtra("note",n20);
                i.putExtra("dayName", "Durmi, Tue");
                i.putExtra("date","20 April 2020");
                i.putExtra("dateInt",20);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o21);
                i.putExtra("note",n21);
                i.putExtra("dayName", "Thelang, Wed");
                i.putExtra("date","21 April 2020");
                i.putExtra("dateInt",21);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o22);
                i.putExtra("note",n22);
                i.putExtra("dayName", "Theman, Thurs");
                i.putExtra("date","22 April 2020");
                i.putExtra("dateInt",22);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o23);
                i.putExtra("note",n23);
                i.putExtra("dayName", "Bhomta, Fri");
                i.putExtra("date","23 April 2020");
                i.putExtra("dateInt",23);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o24);
                i.putExtra("note",n24);
                i.putExtra("dayName", "Bhomti, Sat");
                i.putExtra("date","24 April 2020");
                i.putExtra("dateInt",24);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o25);
                i.putExtra("note",n25);
                i.putExtra("dayName", "Bhomkuru, Sun");
                i.putExtra("date","25 April 2020");
                i.putExtra("dateInt",25);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o26);
                i.putExtra("note",n26);
                i.putExtra("dayName", "Urmi, Tue");
                i.putExtra("date","26 April 2020");
                i.putExtra("dateInt",26);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o27);
                i.putExtra("note",n27);
                i.putExtra("dayName", "Durmi, Tue");
                i.putExtra("date","27 April 2020");
                i.putExtra("dateInt",27);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o28);
                i.putExtra("note",n28);
                i.putExtra("dayName", "Thelang, Wed");
                i.putExtra("date","28 April 2020");
                i.putExtra("dateInt",28);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), HolidayPopupWindow.class);
                i.putExtra("holiday",o29);
                i.putExtra("note",n29);
                i.putExtra("dayName", "Theman, Thurs");
                i.putExtra("date","29 April 2020");
                i.putExtra("dateInt",29);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });

        t30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),HolidayPopupWindow.class);
                i.putExtra("holiday",o30);
                i.putExtra("note",n30);
                i.putExtra("dayName", "Bhomta, Fri");
                i.putExtra("date","30 April 2020");
                i.putExtra("dateInt",30);
                i.putExtra("month", 4);
                startActivity(i);
            }
        });







    }


    public static AprilFrag newInstance(String text) {

        AprilFrag f = new AprilFrag();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}
