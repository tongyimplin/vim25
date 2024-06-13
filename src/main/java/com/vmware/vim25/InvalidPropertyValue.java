package com.vmware.vim25;

import com.vmware.vim25.UnconfiguredPropertyValue;
import com.vmware.vim25.VAppPropertyFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidPropertyValue")
@XmlSeeAlso({UnconfiguredPropertyValue.class})
public class InvalidPropertyValue extends VAppPropertyFault {}
