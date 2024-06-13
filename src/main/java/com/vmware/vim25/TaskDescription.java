package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.TaskDescription;
import com.vmware.vim25.TypeDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskDescription", propOrder = {"methodInfo", "state", "reason"})
public class TaskDescription extends DynamicData {
  @XmlElement(required = true)
  protected List<ElementDescription> methodInfo;
  
  @XmlElement(required = true)
  protected List<ElementDescription> state;
  
  @XmlElement(required = true)
  protected List<TypeDescription> reason;
  
  public List<ElementDescription> getMethodInfo() {
    if (this.methodInfo == null)
      this.methodInfo = new ArrayList<>(); 
    return this.methodInfo;
  }
  
  public List<ElementDescription> getState() {
    if (this.state == null)
      this.state = new ArrayList<>(); 
    return this.state;
  }
  
  public List<TypeDescription> getReason() {
    if (this.reason == null)
      this.reason = new ArrayList<>(); 
    return this.reason;
  }
}
