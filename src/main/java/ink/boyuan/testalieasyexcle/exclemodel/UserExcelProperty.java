package ink.boyuan.testalieasyexcle.exclemodel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/10/30 11:18
 * @description
 **/
@ColumnWidth(22)
@ContentRowHeight(15)
@Data
public class UserExcelProperty implements Serializable {

    @ExcelProperty(value = "姓名", index = 0)
    private String name;

    @ExcelProperty(value = "密码", index = 1)
    private String password;

    @ExcelProperty(value = "电话号码", index = 2)
    private String phone;

    @ExcelProperty(value = "创建时间", index = 3)
    private String createTime;
}
