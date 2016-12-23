package parser.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * sql解析结果
 * Created by aude on 2016/12/23.
 */
public class ParseResult {

    /**
     * 路由计算单元
     */
    private List<CalculateUnit> calculateUnits;

    /**
     * 原始sql
     */
    private String sql = "";

    /**
     * sql中的所有的表名
     * tables为路由计算共有属性,多组RouteCalculateUnit使用相同的tables
     */
    private List<String> tables = new ArrayList<String>();

    /**
     * sql中所有的表名
     * key table alias
     * value table realname
     */
    private Map<String, String> tableAliasMap = new LinkedHashMap<String, String>();

    /**
     * select list 中所有的列的别名(普通列，不包含有函数的列),如果没有别名,别名＝列名
     * 列名：别名
     * 列名：列名
     */
    private Map<String/*field*/, String/*alias*/> aliaColumns;

    /**
     * select中是否有*
     */
    private boolean hasAllColumnExpr;

    public List<CalculateUnit> getCalculateUnits() {
        return calculateUnits;
    }

    public void setCalculateUnits(List<CalculateUnit> calculateUnits) {
        this.calculateUnits = calculateUnits;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public List<String> getTables() {
        return tables;
    }

    public void setTables(List<String> tables) {
        this.tables = tables;
    }

    public Map<String, String> getTableAliasMap() {
        return tableAliasMap;
    }

    public void setTableAliasMap(Map<String, String> tableAliasMap) {
        this.tableAliasMap = tableAliasMap;
    }

    public Map<String, String> getAliaColumns() {
        return aliaColumns;
    }

    public void setAliaColumns(Map<String, String> aliaColumns) {
        this.aliaColumns = aliaColumns;
    }

    public boolean isHasAllColumnExpr() {
        return hasAllColumnExpr;
    }

    public void setHasAllColumnExpr(boolean hasAllColumnExpr) {
        this.hasAllColumnExpr = hasAllColumnExpr;
    }
}