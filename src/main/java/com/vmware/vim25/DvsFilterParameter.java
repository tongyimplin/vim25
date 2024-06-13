package com.vmware.vim25;

import com.vmware.vim25.DvsFilterParameter;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsFilterParameter", propOrder = {"parameters"})
public class DvsFilterParameter extends DynamicData {
  protected List<String> parameters;
  
  public List<String> getParameters() {
    if (this.parameters == null)
      this.parameters = new ArrayList<>(); 
    return this.parameters;
  }
}
