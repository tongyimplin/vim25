package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ClusterHostInfraUpdateHaModeAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterHostInfraUpdateHaModeAction", propOrder = {"operationType"})
public class ClusterHostInfraUpdateHaModeAction extends ClusterAction {
  @XmlElement(required = true)
  protected String operationType;
  
  public String getOperationType() {
    return this.operationType;
  }
  
  public void setOperationType(String paramString) {
    this.operationType = paramString;
  }
}
