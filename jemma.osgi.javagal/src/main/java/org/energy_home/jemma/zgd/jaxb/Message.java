/**
 * This file is part of JEMMA - http://jemma.energy-home.org
 * (C) Copyright 2013 Telecom Italia (http://www.telecomitalia.it)
 *
 * JEMMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License (LGPL) version 3
 * or later as published by the Free Software Foundation, which accompanies
 * this distribution and is available at http://www.gnu.org/licenses/lgpl.html
 *
 * JEMMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License (LGPL) for more details.
 *
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.13 at 03:45:34 PM CET 
//


package org.energy_home.jemma.zgd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZCLMessage" type="{http://www.zigbee.org/GWGSchema}ZCLMessage"/>
 *         &lt;element name="ZDPMessage" type="{http://www.zigbee.org/GWGSchema}ZDPMessage"/>
 *         &lt;element name="APSMessage" type="{http://www.zigbee.org/GWGSchema}APSMessageEvent"/>
 *         &lt;element name="NWKMessage" type="{http://www.zigbee.org/GWGSchema}NWKMessageEvent"/>
 *         &lt;element name="InterPANMessage" type="{http://www.zigbee.org/GWGSchema}InterPANMessageEvent"/>
 *         &lt;element name="MACMessage" type="{http://www.zigbee.org/GWGSchema}MACMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
    "zclMessage",
    "zdpMessage",
    "apsMessage",
    "nwkMessage",
    "interPANMessage",
    "macMessage"
})
public class Message {

    @XmlElement(name = "ZCLMessage", required = true)
    protected ZCLMessage zclMessage;
    @XmlElement(name = "ZDPMessage", required = true)
    protected ZDPMessage zdpMessage;
    @XmlElement(name = "APSMessage", required = true)
    protected APSMessageEvent apsMessage;
    @XmlElement(name = "NWKMessage", required = true)
    protected NWKMessageEvent nwkMessage;
    @XmlElement(name = "InterPANMessage", required = true)
    protected InterPANMessageEvent interPANMessage;
    @XmlElement(name = "MACMessage", required = true)
    protected MACMessage macMessage;

    /**
     * Gets the value of the zclMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ZCLMessage }
     *     
     */
    public ZCLMessage getZCLMessage() {
        return zclMessage;
    }

    /**
     * Sets the value of the zclMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZCLMessage }
     *     
     */
    public void setZCLMessage(ZCLMessage value) {
        this.zclMessage = value;
    }

    /**
     * Gets the value of the zdpMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ZDPMessage }
     *     
     */
    public ZDPMessage getZDPMessage() {
        return zdpMessage;
    }

    /**
     * Sets the value of the zdpMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZDPMessage }
     *     
     */
    public void setZDPMessage(ZDPMessage value) {
        this.zdpMessage = value;
    }

    /**
     * Gets the value of the apsMessage property.
     * 
     * @return
     *     possible object is
     *     {@link APSMessageEvent }
     *     
     */
    public APSMessageEvent getAPSMessage() {
        return apsMessage;
    }

    /**
     * Sets the value of the apsMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link APSMessageEvent }
     *     
     */
    public void setAPSMessage(APSMessageEvent value) {
        this.apsMessage = value;
    }

    /**
     * Gets the value of the nwkMessage property.
     * 
     * @return
     *     possible object is
     *     {@link NWKMessageEvent }
     *     
     */
    public NWKMessageEvent getNWKMessage() {
        return nwkMessage;
    }

    /**
     * Sets the value of the nwkMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NWKMessageEvent }
     *     
     */
    public void setNWKMessage(NWKMessageEvent value) {
        this.nwkMessage = value;
    }

    /**
     * Gets the value of the interPANMessage property.
     * 
     * @return
     *     possible object is
     *     {@link InterPANMessageEvent }
     *     
     */
    public InterPANMessageEvent getInterPANMessage() {
        return interPANMessage;
    }

    /**
     * Sets the value of the interPANMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterPANMessageEvent }
     *     
     */
    public void setInterPANMessage(InterPANMessageEvent value) {
        this.interPANMessage = value;
    }

    /**
     * Gets the value of the macMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MACMessage }
     *     
     */
    public MACMessage getMACMessage() {
        return macMessage;
    }

    /**
     * Sets the value of the macMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACMessage }
     *     
     */
    public void setMACMessage(MACMessage value) {
        this.macMessage = value;
    }

}
