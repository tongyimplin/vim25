package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ScsiLunDurableName;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScsiLunDurableName", propOrder = {"namespace", "namespaceId", "data"})
public class ScsiLunDurableName extends DynamicData {
  @XmlElement(required = true)
  protected String namespace;
  
  protected byte namespaceId;
  
  @XmlElement(type = Byte.class)
  protected List<Byte> data;
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public void setNamespace(String paramString) {
    this.namespace = paramString;
  }
  
  public byte getNamespaceId() {
    return this.namespaceId;
  }
  
  public void setNamespaceId(byte paramByte) {
    this.namespaceId = paramByte;
  }
  
  public List<Byte> getData() {
    if (this.data == null)
      this.data = new ArrayList<>(); 
    return this.data;
  }
}
