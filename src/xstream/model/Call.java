/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xstream.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 *
 * @author nguye
 */
@XStreamAlias("call")
public class Call {

    @XStreamAsAttribute
    private String duration;
    @XStreamAsAttribute
    @XStreamAlias("readable_date")
    private String readable_date;
    @XStreamAsAttribute
    private String presentation;
    @XStreamAsAttribute
    @XStreamAlias("contact_name")
    private String contact_name;
    @XStreamAsAttribute
    private String number;
    @XStreamAsAttribute
    private String date;
    @XStreamAsAttribute
    private String type;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getReadable_date() {
        return readable_date;
    }

    public void setReadable_date(String readable_date) {
        this.readable_date = readable_date;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Call [duration = " + duration + ", readable_date = " + readable_date + ", presentation = " + presentation + ", contact_name = " + contact_name + ", number = " + number + ", date = " + date + ", type = " + type + "]";
    }
}
