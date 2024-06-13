package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsFilterConfig;
import com.vmware.vim25.DvsFilterConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsFilterConfig", propOrder = {"dvsFilterConfig"})
public class ArrayOfDvsFilterConfig {
  @XmlElement(name = "DvsFilterConfig")
  protected List<DvsFilterConfig> dvsFilterConfig;
  
  public List<DvsFilterConfig> getDvsFilterConfig() {
    if (this.dvsFilterConfig == null)
      this.dvsFilterConfig = new ArrayList<>(); 
    return this.dvsFilterConfig;
  }
}
