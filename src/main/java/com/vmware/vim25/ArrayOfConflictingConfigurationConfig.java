package com.vmware.vim25;

import com.vmware.vim25.ArrayOfConflictingConfigurationConfig;
import com.vmware.vim25.ConflictingConfigurationConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConflictingConfigurationConfig", propOrder = {"conflictingConfigurationConfig"})
public class ArrayOfConflictingConfigurationConfig {
  @XmlElement(name = "ConflictingConfigurationConfig")
  protected List<ConflictingConfigurationConfig> conflictingConfigurationConfig;
  
  public List<ConflictingConfigurationConfig> getConflictingConfigurationConfig() {
    if (this.conflictingConfigurationConfig == null)
      this.conflictingConfigurationConfig = new ArrayList<>(); 
    return this.conflictingConfigurationConfig;
  }
}
