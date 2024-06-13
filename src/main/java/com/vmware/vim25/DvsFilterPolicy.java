package com.vmware.vim25;

import com.vmware.vim25.DvsFilterConfig;
import com.vmware.vim25.DvsFilterPolicy;
import com.vmware.vim25.InheritablePolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsFilterPolicy", propOrder = {"filterConfig"})
public class DvsFilterPolicy extends InheritablePolicy {
  protected List<DvsFilterConfig> filterConfig;
  
  public List<DvsFilterConfig> getFilterConfig() {
    if (this.filterConfig == null)
      this.filterConfig = new ArrayList<>(); 
    return this.filterConfig;
  }
}
