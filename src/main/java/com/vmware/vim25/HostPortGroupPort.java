package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPortGroupPort;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPortGroupPort", propOrder = {"key", "mac", "type"})
public class HostPortGroupPort extends DynamicData {
  protected String key;
  
  protected List<String> mac;
  
  @XmlElement(required = true)
  protected String type;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public List<String> getMac() {
    if (this.mac == null)
      this.mac = new ArrayList<>(); 
    return this.mac;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
}
