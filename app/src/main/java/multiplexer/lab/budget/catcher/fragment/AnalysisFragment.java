package multiplexer.lab.budget.catcher.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dell.designapp.R;

import com.daimajia.slider.library.SliderLayout;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class AnalysisFragment extends Fragment {

    HorizontalBarChart chart;

    private SliderLayout mDemoSlider;
    PieChart pieChart;
    ArrayList<Entry> entries;
    ArrayList<String> PieEntryLabels;
    PieDataSet pieDataSet;
    PieData pieData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {

        View v = inflater.inflate(R.layout.activity_analysis_fragment, null);

       /* View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = null;
                boolean error = false;

                Intent i = new Intent(getActivity(), AddNewIncidental.class);
                startActivity(i);
            }
        };

        Button btn = (Button) v.findViewById(R.id.menu);
        btn.setOnClickListener(listener);  */



        chart = (HorizontalBarChart) v.findViewById(R.id.barchart);

        BarData data = new BarData (getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.animateXY(2000, 2000);
        chart.invalidate();

        pieChart = (PieChart) v.findViewById(R.id.chart1);

        entries = new ArrayList<>();

        PieEntryLabels = new ArrayList<String>();

        AddValuesToPIEENTRY();

        AddValuesToPieEntryLabels();

        pieDataSet = new PieDataSet(entries, "");

        pieData = new PieData(PieEntryLabels, pieDataSet);

        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        pieChart.setData(pieData);

        pieChart.animateY(3000);

        return v;

    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(9.000f, 0);
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(15.000f, 1);
        valueSet1.add(v1e2);

        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "");
        barDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("$3,403 earned");
        xAxis.add("-$2,335 spent!");
        return xAxis;
    }

    public void AddValuesToPIEENTRY() {

        entries.add(new BarEntry(25f, 0));
        entries.add(new BarEntry(5f, 1));
        entries.add(new BarEntry(2.5f, 2)); }

    public void AddValuesToPieEntryLabels() {

        PieEntryLabels.add("Uncategorized");
        PieEntryLabels.add("Business Services");
        PieEntryLabels.add("Food & Dining"); }

      //  return v;
    }



