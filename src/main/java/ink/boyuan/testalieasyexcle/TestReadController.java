package ink.boyuan.testalieasyexcle;

import ink.boyuan.testalieasyexcle.exclemodel.DemoData;
import ink.boyuan.testalieasyexcle.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/21 16:07
 * @description
 **/
@RestController
public class TestReadController {
    @Autowired
    private ExcelUtil excelUtil;

    @RequestMapping(value = "read")
    public List<DemoData> simpleRead(@RequestParam(value = "filePath") String filePath) throws Exception {
        List<DemoData> demoData = excelUtil.simpleRead(filePath);
        return demoData;
    }

}
