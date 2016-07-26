<?php
/*
 * Shipment
 */
namespace \Models;

/*
 * Shipment
 */
class Shipment {
    /* @var string $iD  */
    private $iD;
/* @var string $shipper  */
    private $shipper;
/* @var \DateTime $dateShipped  */
    private $dateShipped;
/* @var string $trackingNumber  */
    private $trackingNumber;
/* @var Number $cost  */
    private $cost;
/* @var \\Models\ShipmentItem[] $items  */
    private $items;
/* @var object $xp  */
    private $xp;
}
