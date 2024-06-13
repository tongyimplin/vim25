package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostConfigSpec;
import com.vmware.vim25.HostProfileManagerConfigTaskList;
import com.vmware.vim25.LocalizableMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileManagerConfigTaskList", propOrder = {"configSpec", "taskDescription", "taskListRequirement"})
public class HostProfileManagerConfigTaskList extends DynamicData {
  protected HostConfigSpec configSpec;
  
  protected List<LocalizableMessage> taskDescription;
  
  protected List<String> taskListRequirement;
  
  public HostConfigSpec getConfigSpec() {
    return this.configSpec;
  }
  
  public void setConfigSpec(HostConfigSpec paramHostConfigSpec) {
    this.configSpec = paramHostConfigSpec;
  }
  
  public List<LocalizableMessage> getTaskDescription() {
    if (this.taskDescription == null)
      this.taskDescription = new ArrayList<>(); 
    return this.taskDescription;
  }
  
  public List<String> getTaskListRequirement() {
    if (this.taskListRequirement == null)
      this.taskListRequirement = new ArrayList<>(); 
    return this.taskListRequirement;
  }
}
