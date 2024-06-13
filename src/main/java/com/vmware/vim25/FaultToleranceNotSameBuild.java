package com.vmware.vim25;

import com.vmware.vim25.FaultToleranceNotSameBuild;
import com.vmware.vim25.MigrationFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceNotSameBuild", propOrder = {"build"})
public class FaultToleranceNotSameBuild extends MigrationFault {
  @XmlElement(required = true)
  protected String build;
  
  public String getBuild() {
    return this.build;
  }
  
  public void setBuild(String paramString) {
    this.build = paramString;
  }
}
