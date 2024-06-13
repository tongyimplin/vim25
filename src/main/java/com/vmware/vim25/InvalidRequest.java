package com.vmware.vim25;

import com.vmware.vim25.InvalidType;
import com.vmware.vim25.MethodNotFound;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidRequest")
@XmlSeeAlso({InvalidType.class, MethodNotFound.class})
public class InvalidRequest extends RuntimeFault {}
