package j_c.package;

import io.jenkins.plugins.echarts.api.PieChartModel;
import io.jenkins.plugins.echarts.api.PieData;
import io.jenkins.plugins.util.JacksonFacade;

public class ViewModel {
    public static String getPieChartModelJson() {
        PieChartModel model = new PieChartModel("Chart Title");
        model.add(new PieData("Segment 1", 10), PieChartModel.Palette.RED);
        model.add(new PieData("Segment 2", 20), PieChartModel.Palette.GREEN);
        model.add(new PieData("Segment 3", 30), PieChartModel.Palette.BLUE);
        return new JacksonFacade().toJson(model);
    }
}
