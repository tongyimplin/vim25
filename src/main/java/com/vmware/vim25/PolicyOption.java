package com.vmware.vim25;

import com.vmware.vim25.CompositePolicyOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.PolicyOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyOption", propOrder = {"id", "parameter"})
@XmlSeeAlso({CompositePolicyOption.class})
public class PolicyOption extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  protected List<KeyAnyValue> parameter;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public List<KeyAnyValue> getParameter() {
    if (this.parameter == null)
      this.parameter = new ArrayList<>(); 
    return this.parameter;
  }
}
