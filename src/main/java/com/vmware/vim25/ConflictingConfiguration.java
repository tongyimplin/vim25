package com.vmware.vim25;

import com.vmware.vim25.ConflictingConfiguration;
import com.vmware.vim25.ConflictingConfigurationConfig;
import com.vmware.vim25.DvsFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConflictingConfiguration", propOrder = {"configInConflict"})
public class ConflictingConfiguration extends DvsFault {
  @XmlElement(required = true)
  protected List<ConflictingConfigurationConfig> configInConflict;
  
  public List<ConflictingConfigurationConfig> getConfigInConflict() {
    if (this.configInConflict == null)
      this.configInConflict = new ArrayList<>(); 
    return this.configInConflict;
  }
}
