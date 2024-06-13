package com.vmware.vim25;

import com.vmware.vim25.ApplyHostProfileConfigurationSpec;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProfileExecuteResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyHostProfileConfigurationSpec", propOrder = {"host", "taskListRequirement", "taskDescription", "rebootStateless", "rebootHost", "faultData"})
public class ApplyHostProfileConfigurationSpec extends ProfileExecuteResult {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected List<String> taskListRequirement;
  
  protected List<LocalizableMessage> taskDescription;
  
  protected Boolean rebootStateless;
  
  protected Boolean rebootHost;
  
  protected LocalizedMethodFault faultData;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<String> getTaskListRequirement() {
    if (this.taskListRequirement == null)
      this.taskListRequirement = new ArrayList<>(); 
    return this.taskListRequirement;
  }
  
  public List<LocalizableMessage> getTaskDescription() {
    if (this.taskDescription == null)
      this.taskDescription = new ArrayList<>(); 
    return this.taskDescription;
  }
  
  public Boolean isRebootStateless() {
    return this.rebootStateless;
  }
  
  public void setRebootStateless(Boolean paramBoolean) {
    this.rebootStateless = paramBoolean;
  }
  
  public Boolean isRebootHost() {
    return this.rebootHost;
  }
  
  public void setRebootHost(Boolean paramBoolean) {
    this.rebootHost = paramBoolean;
  }
  
  public LocalizedMethodFault getFaultData() {
    return this.faultData;
  }
  
  public void setFaultData(LocalizedMethodFault paramLocalizedMethodFault) {
    this.faultData = paramLocalizedMethodFault;
  }
}
