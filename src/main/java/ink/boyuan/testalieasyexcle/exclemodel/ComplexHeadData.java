package ink.boyuan.testalieasyexcle.exclemodel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * @program: alieasyexceldemo
 * @description: //复杂头数据.这里最终效果是第一行就一个主标题，第二行分类
 * @author: Mr.Wang
 * @create: 2020-01-19 19:00
 **/
@Data
@ColumnWidth(22)
@ContentRowHeight(15)
public class ComplexHeadData {

    @ExcelProperty({"学生", "姓名"})
    private String string;

    @ExcelProperty({"学生", "出生日期"})
    private String date;

    @ExcelProperty({"学生", "分数"})
    private Double doubleData;

    public ComplexHeadData(String string, String date, Double doubleData) {
        this.string = string;
        this.date = date;
        this.doubleData = doubleData;
    }
}
