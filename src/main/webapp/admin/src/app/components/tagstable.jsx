const React = require('react');
const Table = require('material-ui/lib/table/table');
const TableHeader = require('material-ui/lib/table/table-header');
const TableRow = require('material-ui/lib/table/table-row');
const TableHeaderColumn = require('material-ui/lib/table/table-header-column');
const TableBody = require('material-ui/lib/table/table-body');
const TableFooter = require('material-ui/lib/table/table-footer');
const TableRowColumn = require('material-ui/lib/table/table-row-column');

const  TagTable = React.createClass({
    getInitialState(){
        return  {
            fixedHeader: true,
            fixedFooter: true,
            stripedRows: false,
            showRowHover: false,
            selectable: true,
            multiSelectable: true,
            enableSelectAll: true,
            deselectOnClickaway: false,
            height: '200px',
            tags:[],
        };
    },
    componentDidMount:  function() {
        .get('/api/tags')
    },
    render(){
        return (
    <Table
                height={this.state.height}
                fixedHeader={this.state.fixedHeader}
                fixedFooter={this.state.fixedFooter}
                selectable={this.state.selectable}
                multiSelectable={this.state.multiSelectable}
                onRowSelection={this._onRowSelection}>
                <TableHeader enableSelectAll={this.state.enableSelectAll} adjustForCheckbox={false}>
                    <TableRow>
                        <TableHeaderColumn colSpan="3" tooltip='Super Header' style={{textAlign: 'center'}} >
                            <h2>Tags</h2>
                        </TableHeaderColumn>
                    </TableRow>
                    <TableRow>
                        <TableHeaderColumn tooltip='Name that will display'>Name</TableHeaderColumn>
                    </TableRow>
                </TableHeader>
                <TableBody
                    deselectOnClickaway={this.state.deselectOnClickaway}
                    showRowHover={this.state.showRowHover}
                    stripedRows={this.state.stripedRows}>

                    {this.props.tags.map(function(tag) {
                        return <TableRow key={tag.id}>
                            <TableRowColumn>{tag.name}</TableRowColumn>
                        </TableRow>;
                    })}
                </TableBody>
            </Table>
        );
    },
});

module.exports = TagTable;