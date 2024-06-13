package com.vmware.vim25;

import com.vmware.vim25.AlarmAction;
import com.vmware.vim25.GroupAlarmAction;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupAlarmAction", propOrder = {"action"})
public class GroupAlarmAction extends AlarmAction {
  @XmlElement(required = true)
  protected List<AlarmAction> action;
  
  public List<AlarmAction> getAction() {
    if (this.action == null)
      this.action = new ArrayList<>(); 
    return this.action;
  }
}
