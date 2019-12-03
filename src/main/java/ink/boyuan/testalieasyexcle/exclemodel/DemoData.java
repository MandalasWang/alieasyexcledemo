package ink.boyuan.testalieasyexcle.exclemodel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import lombok.Data;



/**
 * 基础数据类.这里的排序和excel里面的排序一致
 *
 * @author wyy
 **/
@Data
@ColumnWidth(22)
@ContentRowHeight(15)
public class DemoData {

    @ExcelProperty(value = "第一列",index = 0)
    private String string;

    @ExcelProperty(value = "第二列",index = 1)
    private String date;

    @ExcelProperty(value = "第三列",index = 2)
    private Double doubleData;

    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;

    public DemoData(String string, String date, Double doubleData) {
        this.string = string;
        this.date = date;
        this.doubleData = doubleData;
    }

    public DemoData() {
    }
}