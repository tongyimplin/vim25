package com.vmware.vim25;

import com.vmware.vim25.VirtualEthernetCard;
import com.vmware.vim25.VirtualVmxnet2;
import com.vmware.vim25.VirtualVmxnet3;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVmxnet")
@XmlSeeAlso({VirtualVmxnet2.class, VirtualVmxnet3.class})
public class VirtualVmxnet extends VirtualEthernetCard {}
