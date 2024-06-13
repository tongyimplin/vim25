package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNetIpStackInfoNetToMedia;
import com.vmware.vim25.NetIpStackInfoNetToMedia;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetIpStackInfoNetToMedia", propOrder = {"netIpStackInfoNetToMedia"})
public class ArrayOfNetIpStackInfoNetToMedia {
  @XmlElement(name = "NetIpStackInfoNetToMedia")
  protected List<NetIpStackInfoNetToMedia> netIpStackInfoNetToMedia;
  
  public List<NetIpStackInfoNetToMedia> getNetIpStackInfoNetToMedia() {
    if (this.netIpStackInfoNetToMedia == null)
      this.netIpStackInfoNetToMedia = new ArrayList<>(); 
    return this.netIpStackInfoNetToMedia;
  }
}
