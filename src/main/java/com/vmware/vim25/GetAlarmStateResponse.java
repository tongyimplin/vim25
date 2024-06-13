package com.vmware.vim25;

import com.vmware.vim25.AlarmState;
import com.vmware.vim25.GetAlarmStateResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "GetAlarmStateResponse")
public class GetAlarmStateResponse {
  protected List<AlarmState> returnval;
  
  public List<AlarmState> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
