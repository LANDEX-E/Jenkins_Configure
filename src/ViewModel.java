import io.jenkins.plugins.echarts.api.PieChartModel;
import io.jenkins.plugins.echarts.api.PieData;
import io.jenkins.plugins.util.JacksonFacade;

public class ViewModel {
    public static String getPieChartModelJson() {
        PieChartModel model = new PieChartModel("Your Chart Title");
        model.add(new PieData("Segment 1 name", 10), Palette.RED);
        model.add(new PieData("Segment 2 name", 15), Palette.GREEN);
        model.add(new PieData("Segment 3 name", 20), Palette.YELLOW);

        return new JacksonFacade().toJson(model);
    }
}
