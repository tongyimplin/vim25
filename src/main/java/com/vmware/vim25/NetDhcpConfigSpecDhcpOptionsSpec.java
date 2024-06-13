package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.NetDhcpConfigSpecDhcpOptionsSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetDhcpConfigSpecDhcpOptionsSpec", propOrder = {"enable", "config", "operation"})
public class NetDhcpConfigSpecDhcpOptionsSpec extends DynamicData {
  protected Boolean enable;
  
  @XmlElement(required = true)
  protected List<KeyValue> config;
  
  @XmlElement(required = true)
  protected String operation;
  
  public Boolean isEnable() {
    return this.enable;
  }
  
  public void setEnable(Boolean paramBoolean) {
    this.enable = paramBoolean;
  }
  
  public List<KeyValue> getConfig() {
    if (this.config == null)
      this.config = new ArrayList<>(); 
    return this.config;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
