/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xstream.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
@XStreamAlias("calls")
public class Calls {

    @XStreamImplicit(itemFieldName="call")
    private List<Call> call = new ArrayList<>();
    
    @XStreamAsAttribute
    private String count;
    
    @XStreamAsAttribute
    @XStreamAlias("backup_date")
    private String backup_date;
    @XStreamAsAttribute
    @XStreamAlias("backup_set")
    private String backup_set;

    public List<Call> getCall() {
        return call;
    }

    public void setCall(List<Call> call) {
        this.call = call;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getBackup_date() {
        return backup_date;
    }

    public void setBackup_date(String backup_date) {
        this.backup_date = backup_date;
    }

    public String getBackup_set() {
        return backup_set;
    }

    public void setBackup_set(String backup_set) {
        this.backup_set = backup_set;
    }
    
    @Override
    public String toString() {
        return "Calls [call = " + call.size() + ", count = " + count + ", backup_date = " + backup_date + ", backup_set = " + backup_set + "]";
    }
}
