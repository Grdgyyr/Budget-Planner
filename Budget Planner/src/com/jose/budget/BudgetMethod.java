package com.jose.budget;

import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Ampatuan | Occeña | Henarios
 */
public class BudgetMethod {
    public void GetBudgetGraph(double billLimit, double foodLimit, double utilLimit, double miscLimit, double mnthlybudgetIn){
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Bills Allocation", new Double(billLimit));
        pieDataset.setValue("Food Allocation", new Double(foodLimit));
        pieDataset.setValue("Utils Allocation", new Double(utilLimit));
        pieDataset.setValue("Misc Allocation", new Double(miscLimit));
        pieDataset.setValue("Monthly Budget", new Double(mnthlybudgetIn));
        JFreeChart chart = ChartFactory.createPieChart3D("Monthly Budget",pieDataset,true,true,true);
        PiePlot3D p = (PiePlot3D)chart.getPlot();
        ChartFrame frame = new ChartFrame("Budget Planner™",chart);
        ImageIcon img = new ImageIcon("icon.png");
        frame.setIconImage(img.getImage());
        frame.setVisible(true);
        frame.setSize(300,300);
    }
}
