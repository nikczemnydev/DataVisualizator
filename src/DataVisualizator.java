import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.util.Scanner;

public class DataVisualizator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your data in the following format: name1 percentage1;" +
                "name2 percentage2;etc...");
        String data = scanner.nextLine();
        System.out.println("As what type of chart would you like me to represent your data, pie or bar?");
        String type = scanner.nextLine();
        scanner.close();

        String[] fields = data.split(";");
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset();

        for (String field : fields) {
            String[] parts = field.split(" ");
            String name = parts[0];
            double value = Double.parseDouble(parts[1]);
            if (type.equals("pie")) {
                pieDataset.setValue(name, value);
            } else if (type.equals("bar")) {
                barDataset.setValue(value, "", name);
            }
        }

        JFreeChart chart;
        if (type.equals("pie")) {
            chart = ChartFactory.createPieChart("Your data in pie chart:", pieDataset, true,
                    true, false);
        } else if (type.equals("bar")) {
            chart = ChartFactory.createBarChart("Your data in bar chart:", "", "",
                    barDataset, PlotOrientation.VERTICAL, true, true, false);
        } else {
            System.out.println("Unsupported graph type entered.");
            return;
        }

        JFrame frame = new JFrame("DataVisualizator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
