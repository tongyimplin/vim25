package com.vmware.vim25;

import com.vmware.vim25.ArrayOfKmipServerInfo;
import com.vmware.vim25.KmipServerInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKmipServerInfo", propOrder = {"kmipServerInfo"})
public class ArrayOfKmipServerInfo {
  @XmlElement(name = "KmipServerInfo")
  protected List<KmipServerInfo> kmipServerInfo;
  
  public List<KmipServerInfo> getKmipServerInfo() {
    if (this.kmipServerInfo == null)
      this.kmipServerInfo = new ArrayList<>(); 
    return this.kmipServerInfo;
  }
}
