package com.vmware.vim25;

import com.vmware.vim25.VirtualAHCIController;
import com.vmware.vim25.VirtualController;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualSATAController")
@XmlSeeAlso({VirtualAHCIController.class})
public class VirtualSATAController extends VirtualController {}
