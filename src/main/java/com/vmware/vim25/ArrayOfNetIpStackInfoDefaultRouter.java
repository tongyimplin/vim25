package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNetIpStackInfoDefaultRouter;
import com.vmware.vim25.NetIpStackInfoDefaultRouter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetIpStackInfoDefaultRouter", propOrder = {"netIpStackInfoDefaultRouter"})
public class ArrayOfNetIpStackInfoDefaultRouter {
  @XmlElement(name = "NetIpStackInfoDefaultRouter")
  protected List<NetIpStackInfoDefaultRouter> netIpStackInfoDefaultRouter;
  
  public List<NetIpStackInfoDefaultRouter> getNetIpStackInfoDefaultRouter() {
    if (this.netIpStackInfoDefaultRouter == null)
      this.netIpStackInfoDefaultRouter = new ArrayList<>(); 
    return this.netIpStackInfoDefaultRouter;
  }
}
