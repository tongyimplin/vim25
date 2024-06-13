package com.vmware.vim25;

import com.vmware.vim25.AffinityConfigured;
import com.vmware.vim25.MigrationFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityConfigured", propOrder = {"configuredAffinity"})
public class AffinityConfigured extends MigrationFault {
  @XmlElement(required = true)
  protected List<String> configuredAffinity;
  
  public List<String> getConfiguredAffinity() {
    if (this.configuredAffinity == null)
      this.configuredAffinity = new ArrayList<>(); 
    return this.configuredAffinity;
  }
}
