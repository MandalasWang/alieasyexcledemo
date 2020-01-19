package ink.boyuan.testalieasyexcle;

import ink.boyuan.testalieasyexcle.exclemodel.DemoData;
import ink.boyuan.testalieasyexcle.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/21 15:55
 * @description
 **/
@RestController
public class TestWriteController {

    @Autowired
    private ExcelUtil excelUtil;


    @RequestMapping(value = "report")
    public void testWrite(HttpServletResponse response) {
        List<DemoData> list = new ArrayList<>();
        DemoData demoData = new DemoData
                ("测试1",
                        LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")),
                        200.00);
        list.add(demoData);
        try {
            excelUtil.writeExcel(response, list, "测试", "user", demoData.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
