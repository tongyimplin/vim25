package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.IoFilterHostIssue;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IoFilterHostIssue", propOrder = {"host", "issue"})
public class IoFilterHostIssue extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  @XmlElement(required = true)
  protected List<LocalizedMethodFault> issue;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public List<LocalizedMethodFault> getIssue() {
    if (this.issue == null)
      this.issue = new ArrayList<>(); 
    return this.issue;
  }
}
