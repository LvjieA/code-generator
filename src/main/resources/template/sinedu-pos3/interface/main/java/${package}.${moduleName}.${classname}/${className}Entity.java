package ${package}.${moduleName};

import net.sinedu.company.bases.BasePojo;
import java.util.Date;
#if(${hasBigDecimal})
import java.math.BigDecimal;
#end


/**
 * ${comments}
 *
 * @author ${author}
 * @email ${email}
 * @date ${datetime}
 */
public class ${className} extends BasePojo {
	private static final long serialVersionUID = 1L;

#foreach ($column in $columns)
    /**
    * $column.comments
    */
    private $column.attrType $column.attrname;
#end

#foreach ($column in $columns)
	public void set${column.attrName}($column.attrType $column.attrname) {
		this.$column.attrname = $column.attrname;
	}
	public $column.attrType get${column.attrName}() {
		return $column.attrname;
	}
#end
}